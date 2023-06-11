# calculations

Given below are the steps to build project.

1.git clone the project in local workspace.

2.run mvn clean install

3.run as spring boot project or from command prompt java -jar calculations-0.0.1-SNAPSHOT.jar

4.This project is using H2 in memory database

once Project is setup

Sample curl command

1. To get rewards summary by name

  curl --location 'http://localhost:8080/getRewards/name/Alex' \
  --header 'Authorization: Basic YWRtaW46YWRtaW4=' \
  --header 'Cookie: JSESSIONID=5B646673E959EEB41DAC01872D1F88F4'

2. To get rewards summary by id

  curl --location 'http://localhost:8080/getRewards/104' \
  --header 'Authorization: Basic YWRtaW46YWRtaW4=' \
  --header 'Cookie: JSESSIONID=5B646673E959EEB41DAC01872D1F88F4'
