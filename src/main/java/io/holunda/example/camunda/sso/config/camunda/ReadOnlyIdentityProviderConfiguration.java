package io.holunda.example.camunda.sso.config.camunda;

import io.holunda.example.camunda.sso.config.camunda.OAuthIdentityServiceProvider;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.persistence.GenericManagerFactory;
import org.camunda.bpm.spring.boot.starter.configuration.CamundaProcessEngineConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReadOnlyIdentityProviderConfiguration implements CamundaProcessEngineConfiguration {
    @Override
    public void preInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
        processEngineConfiguration
            .setIdentityProviderSessionFactory(new GenericManagerFactory(OAuthIdentityServiceProvider.class));
    }
}
