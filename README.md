# Photoz Clone

## Description
Photoz Clone is a demo project built with Spring Boot that allows users to upload, view, and download photos. The application provides a simple interface for managing photos and utilizes a relational database for storage.

## Features
- Upload photos with metadata (filename, content type).
- View uploaded photos in a gallery format.
- Download photos directly from the gallery.
- Built with Spring Boot and uses H2 in-memory database for development.

## Technologies Used
- Java 23
- Spring Boot 3.4.1
- Spring Data JDBC
- HTML/CSS/JavaScript for the frontend
- H2 Database

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 23
- Maven

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/photoz-clone.git
   cd photoz-clone
   ```

2. Build the project using Maven:
   ```bash
   ./mvnw clean install
   ```

3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Open your browser and navigate to `http://localhost:8080` to access the application.

### Usage
- Use the upload feature to add photos to the gallery.
- Click on a photo to download it.

## API Endpoints
- `POST /photoz`: Upload a new photo.
- `GET /photoz`: Retrieve all photos.
- `DELETE /photoz/{id}`: Delete a photo by ID.

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any enhancements or bug fixes.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- Inspired by the tutorial from [YouTube](https://www.youtube.com/watch?v=QuvS_VLbGko).