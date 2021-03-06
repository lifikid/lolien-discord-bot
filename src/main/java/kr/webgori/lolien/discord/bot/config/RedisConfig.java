package kr.webgori.lolien.discord.bot.config;

import java.util.Optional;
import kr.webgori.lolien.discord.bot.component.ConfigComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@RequiredArgsConstructor
@Configuration
public class RedisConfig {
  private final ConfigComponent configComponent;

  @Value("${spring.redis.port}")
  private int port;

  @Value("${spring.redis.database}")
  private int database;

  /**
   * JedisConnectionFactory.
   *
   * @return JedisConnectionFactory
   */
  @Bean
  public RedisConnectionFactory redisConnectionFactory() {
    RedisStandaloneConfiguration serverConfig = new RedisStandaloneConfiguration("server", 6379);

    String redisHost = configComponent.getRedisHost();
    serverConfig.setHostName(redisHost);

    serverConfig.setPort(port);
    serverConfig.setDatabase(database);

    Optional.ofNullable(configComponent.getRedisPassword()).ifPresent(p -> {
      RedisPassword redisPassword = RedisPassword.of(p);
      serverConfig.setPassword(redisPassword);
    });

    return new LettuceConnectionFactory(serverConfig);
  }

  /**
   * RedisTemplate.
   *
   * @return RedisTemplate
   */
  @Bean
  public RedisTemplate<String, Object> redisTemplate() {
    RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
    redisTemplate.setKeySerializer(new StringRedisSerializer());
    redisTemplate.setValueSerializer(new StringRedisSerializer());
    redisTemplate.setHashKeySerializer(new StringRedisSerializer());
    redisTemplate.setHashValueSerializer(new StringRedisSerializer());
    redisTemplate.setConnectionFactory(redisConnectionFactory());
    return redisTemplate;
  }
}