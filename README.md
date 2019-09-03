# VehicleSimulation
Description: Vehicle Simulation live project

## Step 1 - Deploying Application in GCP:

- Created a Spring boot application.
- Created a project in Google Cloud Platform(GCP) and added those configuration in pom.xml
- Written a sample Restful "GET" Api to test the application
- Created app.yaml file which is requried for deploying in GCP environment.

## Step 2 - Create and invoke data from H2(Java in-memory DB):
- Enable the H2 console and other Data source information in application.properties
- Create schema in schema.sql and data to be inserted in data.sql and add spring-boot-starter-jdbc dependency in pom.xml
- Build and start the spring boot server and login to H2 console using configured properties. 
- Important: Create schema using a check "IF NOT EXISTS" otherwise when we restart the spring boot, it will resulted in error.

## Step 3 - Create Restful APIs
- Create a Model(POJO) for the customerInfo table
- Create a Interface and implementation class to query the DB
- Created getCustomers() and findCustomerById() APIs.

## Step 4 - Create User Interface using Angular
