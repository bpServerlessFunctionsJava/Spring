# spring commands build
```
mvnw -U clean package
SET LAMBDA_ROLE_ARN=arn:aws:iam::336081765760:role/LambdaExecuteRole
aws lambda create-function --function-name SpringServerlessFunction --role arn:aws:iam::336081765760:role/LambdaExecuteRole --zip-file fileb://C:/Users/Beheerder/Desktop/bp-projects/spring/Spring/target/bpSpring-0.0.1-SNAPSHOT-aws.jar --handler org.springframework.cloud.function.adapter.aws.FunctionInvoker --description "Spring Cloud Function Adapter Example" --runtime java11 --region eu-west-1 --timeout 30 --memory-size 1024 --publish
```
