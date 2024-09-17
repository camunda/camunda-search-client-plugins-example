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

See sample docker files for [ElasticSearch and OpenSearch](./docker-example/docker-compose.elasticsearch.yaml).

For every component, make sure to change configuration properties and specify the correct path to the JAR file in the `volumes` section.

To run ElasticSearch, make sure that property `SEARCH_DB=elasticsearch` is set in the [.env](./docker-example/.env), then run `docker-compose -f docker-compose.yaml up`.

To run ElasticSearch, make sure that property `SEARCH_DB=opensearch` is set in the [.env](./docker-example/.env), then run `docker-compose -f docker-compose.yaml --profile opensearch up`.

You may also need to uncomment ElasticSearch or OpenSearch related properties in the Docker Compose YAML file.
