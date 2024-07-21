<h1 align="center">ZetaBot</h1>

[![Discord](https://img.shields.io/discord/1251629071960506479?logo=discord&logoColor=%23fff&label=discord)](https://Fdiscord.gg/n2wGCdj46B)
[![GitHub last commit](https://img.shields.io/github/last-commit/freitaseric/zetabot)](https://img.shields.io/github/last-commit/freitaseric/zetabot)
[![GitHub issues](https://img.shields.io/github/issues-raw/freitaseric/zetabot)](https://img.shields.io/github/issues-raw/freitaseric/zetabot)
[![GitHub pull requests](https://img.shields.io/github/issues-pr/freitaseric/zetabot)](https://img.shields.io/github/issues-pr/freitaseric/zetabot)
[![GitHub](https://img.shields.io/github/license/freitaseric/zetabot)](https://img.shields.io/github/license/freitaseric/zetabot)

## Table of Contents

- [Tutorial](#basic-tutorial)
- [Documentation](#documentation)
- [Development](#development)
- [Contribute](#contribute)
- [License](#license)

### Language

- [🇧🇷 Português (Brasil)](./LEIAME.md)
- [🇺🇸 English (US)](./README.md)
- [🇪🇸 Español (ES)](./LEEME.md)

## Basic Tutorial
[(Back to top)](#table-of-contents)

> [!WARNING]
> The basic tutorial still in development...

## Documentation
[(Back to top)](#table-of-contents)

> [!WARNING]
> The documentation still in development...

## Development
[(Back to top)](#table-of-contents)

### First Step: Clone the repository

Cloning from branch main (latest production release)
```shell
# Using git
$ git clone https://github.com/freitaseric/zetabot.git #--depth=1 (optional)

# Using github cli
$ gh repo clone freitaseric/zetabot #-- --depth=1 (optional)
```

Cloning from branch beta (latest beta release)
```shell
# Using git
$ git clone https://github.com/freitaseric/zetabot.git -b beta #--depth=1 (optional)

# Using github cli
$ gh repo clone freitaseric/zetabot -- -b beta #--depth=1 (optional)
```

Cloning from branch canary (latest canary release)
```shell
# Using git
$ git clone https://github.com/freitaseric/zetabot.git -b canary #--depth=1 (optional)

# Using github cli
$ gh repo clone freitaseric/zetabot -- -b canary #--depth=1 (optional)
```

Cloning from branch develop (latest untested code)

```shell
# Using git
$ git clone https://github.com/freitaseric/zetabot.git -b beta #--depth=1 (optional)

# Using github cli
$ gh repo clone freitaseric/zetabot -- -b beta #--depth=1 (optional)
```

> [!WARNING]
> This is the most recent code, but is the most unstable and untested code, it's good for test and contributions.

### Second Step: Choosing an IDE/Code Editor

We recommend you to use the [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/), because this provides a lot of features to make your work with java and gradle more easy, and it's free.

Other recommendations for you:

- [Visual Studio Code](https://code.visualstudio.com)
- [Eclipse](https://eclipse.org/downloads)

After installation, you can open the cloned project with it and follow the next steps.

### Third Step: Installing pre-requisites

This project is developed using this stack:

- [Gradle 8.9](https://gradle.org/install/)
- [OpenJDK 22](https://jdk.java.net/22/)

### Fourth step: Install dependencies and code

After all previous step, install the libraries of the project using:
```shell
# On Linux
$ ./gradlew build

# On Windows
$ .\gradlew.bat build
```

And code!

### Fifth step: Building and hosting

To build the application to jar file use the gradle build task:
```shell
# On Linux
$ ./gradlew jar

# On Windows
$ .\gradlew.bat jar
```

After build, you can run locally using `$ java -jar ZetaBot-[VERSION].jar`.

## Contribute
[(Back to top)](#table-of-contents)

> [!WARNING]
> The contribution guide still in development...

## License
[(Back to top)](#table-of-contents)

[GNU GPL-3.0 license](./LICENSE)


