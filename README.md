# Java FileIO Project

This Java project demonstrates reading and parsing configuration files based on the specified environment.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Configuration](#configuration)

- [License](#license)

## Installation

1. Clone the repository:

   ```shell
   git clone https://github.com/harkinsam/java-fileio-project.git
   ```
   ## Usage


1. Execute the Main class using the following command:

    ```shell
    java Main [environment]
    ```

   Replace `[environment]` with one of the following options:
    - `production`
    - `staging`
    - `development`

   If no environment is provided, the default environment is `production`.

3. View the console output to see the parsed configuration details.

Example:
```shell
java Main development
```
## Configuration

The project uses configuration files located in the `config` directory to set environment-specific settings. Here are the details of each configuration file:

- **config.txt**: Production environment configuration.
- **config.txt.staging**: Staging environment configuration.
- **config.txt.dev**: Development environment configuration.

### Configuration Format

The configuration files follow this format:

```makefile
[SectionName]
key=value
```
## License

This project is licensed under the [MIT License](LICENSE).

