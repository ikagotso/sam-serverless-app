# Serverless GraphQL API

SAM/Cloudformation yaml file to create a GraphQL API with AWS AppSync backed by a DynamoDB table 
and Lambda Function.


## Schema

```graphql
        schema {
            query: Query
            mutation: Mutation
        }

        type StellarObject {
            identifier: String
            type: String
            galaxy: String
        }

        input AddStellarObjectInput {
            identifier: String!
            type: String
            galaxy: String
        }

        input UpdateStellarObjectInput {
            identifier: String!
            type: String
            galaxy: String
        }

        type Mutation {
            addStellarObject(input: AddStellarObjectInput!): StellarObject
            updateStellarObject(input: UpdateStellarObjectInput!): StellarObject
            deleteStellarObject(identifier: String!): StellarObject
        }

        type Query {
            getStellarObject(identifier: String!): StellarObject
            getStellarObjects(identifier: String): [StellarObject]
            getStellarObjectCoordinates(identifier: String!): String
        }
```
