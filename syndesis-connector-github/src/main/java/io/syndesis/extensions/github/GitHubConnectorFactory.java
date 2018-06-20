package io.syndesis.extensions.github;

import io.syndesis.integration.component.proxy.ComponentProxyComponent;
import io.syndesis.integration.component.proxy.ComponentProxyFactory;
import sun.awt.ComponentFactory;

/**
 * @author roland
 * @since 20.06.18
 */
public class GitHubConnectorFactory implements ComponentProxyFactory {
    public ComponentProxyComponent newInstance(String componentId, String componentScheme) {
        return new GitHubConnector(componentId, componentScheme);
    }


}
