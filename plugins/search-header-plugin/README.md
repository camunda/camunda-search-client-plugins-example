## Adding custom headers for Elastic Search or Open Search HTTP call

### Build

Build plugin with `mvn clean install`

### Prepare JAR

Copy a JAR file from `${search-header-plugin-folder}/target/search-header-plugin-{version}-jar-with-dependencies.jar` to
a dedicated folder, such as `/tmp/plugin.jar`.

### Run plugin

For every application (Zeebe, Operate, etc) that needs to add plugin in their search DB HTTP call context,
define configuration properties as described on the [official documentation page](https://docs.camunda.io/docs/next/self-managed/setup/guides/configure-db-custom-headers/#configure-components).

### Quickstart

See sample docker files for [Elastic Search](./docker-example/docker-compose.core.elasticsearch.yaml)
and [Open Search](./docker-example/docker-compose.core.opensearch.yaml).

For every component, make sure to change configuration properties and specify the correct path to the JAR file in the `volumes` section.

Once correct values set, run with `docker-compose -f <camunda cluster YAML file> up`.
