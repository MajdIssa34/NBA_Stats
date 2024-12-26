# NBA Stats App


https://github.com/user-attachments/assets/84e09363-093e-47dc-bd6e-dc20543da1e3


This is a web application that displays information about NBA players using data fetched from a backend API. The app allows users to filter players by various parameters such as team, position, name, age, and points per game.

## Features
- **Player List**: View a list of NBA players with their details such as name, team, position, age, and points per game (PPG).
- **Filters**: Apply filters to narrow down the player list based on team, position, name, age, and average points per game.
- **Responsive Design**: The app is designed to be responsive and work across different screen sizes.

## Technologies Used
- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java (Spring Boot)
- **Database**: PostgreSQL
- **API**: RESTful API to fetch player data

## How to Run the Project

### 1. Clone the Repository
```bash
git clone https://github.com/MajdIssa34/NBA_Stats.git
cd NBA_Stats
```

### 2. Backend Setup
To run the backend (Spring Boot application), follow these steps:

1. Open the backend folder in your IDE (e.g., IntelliJ IDEA).
2. Run the Spring Boot application (PlayerApplication.java).
3. The backend will run on http://localhost:8090.

### 3. Access the App
Once you run the Spring Boot application, the full-stack application should be displayed on the screen.

## API Endpoints
GET /api/v1/player
Fetches a list of players with optional query parameters for filtering:

* team (e.g., "MIL")
* name (e.g., "Giannis")
* position (e.g., "F")
* age (e.g., 28)
* average (e.g., 30 PPG)
  
### Example

```bash
GET /api/v1/player?team=mil&position=F
```
