package io.syndesis.extensions.github;

import java.util.Map;
import java.util.Optional;

import io.syndesis.integration.component.proxy.ComponentDefinition;
import io.syndesis.integration.component.proxy.ComponentProxyComponent;
import org.apache.camel.Component;
import org.apache.camel.Endpoint;

/**
 * @author roland
 * @since 20.06.18
 */
public class GitHubConnector extends ComponentProxyComponent {

    private String accessToken;
    private String githubUrl;

    public GitHubConnector(String componentId, String componentScheme) {
        super(componentId, componentScheme);
    }


    @Override
    protected Optional<Component> createDelegateComponent(ComponentDefinition definition, Map<String, Object> options) throws Exception {
        return Optional.empty();
    }

    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {

        // TODO: Heiko, please fill in !!!
        return super.createEndpoint(uri, remaining, parameters);
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }
}
