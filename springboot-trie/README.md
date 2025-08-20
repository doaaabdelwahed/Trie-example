# Spring Boot Trie Application

## Overview
This project is a Spring Boot application that integrates a Trie data structure. It provides REST API endpoints to perform operations on the Trie, including insert, lookup, update, and delete.

## Features
1. **Insert**: Add a word to the Trie.
2. **Lookup**: Check if a word exists in the Trie.
3. **Update**: Replace an existing word in the Trie with a new word.
4. **Delete**: Remove a word from the Trie.

## Project Structure
- **Main Application**: `/src/main/java/com/example/trie/TrieApplication.java`
- **Trie Implementation**: `/src/main/java/com/example/trie/Trie.java`
- **REST Controller**: `/src/main/java/com/example/trie/TrieController.java`
- **Unit Tests**: `/src/test/java/com/example/trie/TrieTest.java`
- **Maven Configuration**: `/pom.xml`

## Prerequisites
- Java 11 or higher
- Maven installed

## How to Run
1. Clone the repository or download the project files.
2. Navigate to the project directory:
   ```bash
   cd springboot-trie
   ```
3. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints
1. **Insert a word**:
   - **URL**: `POST /trie/insert`
   - **Parameters**: `word` (String)
   - **Example**:
     ```bash
     curl -X POST "http://localhost:8080/trie/insert?word=example"
     ```

2. **Lookup a word**:
   - **URL**: `GET /trie/lookup`
   - **Parameters**: `word` (String)
   - **Example**:
     ```bash
     curl -X GET "http://localhost:8080/trie/lookup?word=example"
     ```

3. **Update a word**:
   - **URL**: `PUT /trie/update`
   - **Parameters**: `oldWord` (String), `newWord` (String)
   - **Example**:
     ```bash
     curl -X PUT "http://localhost:8080/trie/update?oldWord=example&newWord=test"
     ```

4. **Delete a word**:
   - **URL**: `DELETE /trie/delete`
   - **Parameters**: `word` (String)
   - **Example**:
     ```bash
     curl -X DELETE "http://localhost:8080/trie/delete?word=example"
     ```

## Testing
Unit tests are provided in `/src/test/java/com/example/trie/TrieTest.java`. Run the tests using Maven:
```bash
mvn test
```

## Next Steps
1. Add more test cases to cover edge scenarios for Trie operations.
2. Implement additional features, such as prefix search or autocomplete.
3. Deploy the application to a cloud platform, such as AWS or Heroku.

## License
This project is licensed under the MIT License.