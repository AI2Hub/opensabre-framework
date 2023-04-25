package io.github.opensabre.cache.redis;

import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.cache.annotation.CachingConfigurerSupport;

@AutoConfiguration
@EnableMethodCache(basePackages = "io.github.opensabre")
public class RedisConfig extends CachingConfigurerSupport {
}