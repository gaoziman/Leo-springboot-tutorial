package org.javatop.minio.controller;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import lombok.extern.slf4j.Slf4j;
import org.javatop.minio.oss.MinioConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-03-28 10:26
 * @description : FileController
 */
@RestController
@RequestMapping("/file")
@Slf4j
public class FileController {

    @Resource
    private MinioClient minioClient;

    @Resource
    private MinioConfiguration minioConfiguration;

    /**
     * 上传文件
     * @param file  文件
     * @return 结果
     * @throws Exception Exception
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        // 上传
        String path = UUID.randomUUID() + file.getOriginalFilename(); // 文件名，使用 UUID 随机
        minioClient.putObject(PutObjectArgs.builder()
                .bucket(minioConfiguration.getBucket()) // 存储桶
                .object(path) // 文件名
                .stream(file.getInputStream(), file.getSize(), -1) // 文件内容
                .contentType(file.getContentType()) // 文件类型
                .build());

        // 获取访问路径
        log.info("文件上传成功，访问路径为：{}",String.format("%s/%s/%s", minioConfiguration.getEndpoint(), minioConfiguration.getBucket(), path));

        // 拼接路径
        return String.format("%s/%s/%s", minioConfiguration.getEndpoint(), minioConfiguration.getBucket(), path);
    }
}

