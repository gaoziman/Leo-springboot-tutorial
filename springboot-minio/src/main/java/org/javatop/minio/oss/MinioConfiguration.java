package org.javatop.minio.oss;

import io.minio.MinioClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-03-28 10:24
 * @description :
 */

@Configuration
@ConfigurationProperties(prefix = "file.minio")
@Data
public class MinioConfiguration {

    private String accessKey;

    private String secretKey;

    private String endpoint;

    private String bucket;

    @Bean
    public MinioClient minioClient() {
        return MinioClient.builder()
                .endpoint(endpoint)
                .credentials(accessKey, secretKey)
                .build();
    }
}
