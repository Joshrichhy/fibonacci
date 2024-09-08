CI/CD Pipeline Setup with GitHub Actions

Overview

This repository contains a Continuous Integration (CI) and Continuous Deployment (CD) pipeline setup using GitHub Actions. The pipeline automates the build, test, and deployment process for the project, ensuring seamless integration and delivery to a staging environment.

Features of the CI/CD Pipeline:
Build Step: Compiles the code and prepares it for testing.
Testing Step: Runs automated unit tests to verify the correctness of the code.
Deployment Step: Automatically deploys the code to a staging environment upon successful test completion.

CI/CD Pipeline Configuration

CI Tool: GitHub Actions
I chose GitHub Actions as the CI tool due to its seamless integration with GitHub, ease of use, and free tier for public repositories.

Pipeline Workflow
The pipeline is configured in the .github/workflows/main.yml file and consists of the following steps:

Build:
Runs when there’s a new commit TO the main branch.
since i use a java application, i am using maven to run the build, test and package by running
mvn -B clean package
Deployment:
If all tests pass, the pipeline automatically deploys the build to a staging environment in an EC2 instance in aws.

The configuration file for the CICD can be checked using this link

https://github.com/Joshrichhy/fibonacci/blob/main/.github/workflows/build.yml

Setup Instructions:
Clone the repository.
Ensure you have Docker, GitHub Actions, AWS CLI
Configure the .github/workflows/build.yml file and any necessary secrets (like cloud credentials, for both AWS CLI and EC2).
Push your changes to trigger the pipeline.

