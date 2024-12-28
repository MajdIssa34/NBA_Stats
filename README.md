# NBA Stats App

https://github.com/user-attachments/assets/8d798834-8350-48be-adc3-19c56f3998da

This is a web application that displays information about NBA players using data fetched from a backend API. The app allows users to filter players by various parameters such as team, position, name, age, and points per game. Additionally, it enables users to compare the stats of two or more players side by side.

## Features

- **Player List**: View a list of NBA players with their details such as name, team, position, age, and points per game (PPG).
- **Filters**: Apply filters to narrow down the player list based on team, position, name, age, and average points per game.
- **Player Comparison**: Compare stats of two players, including PPG, APG, RPG, and more.
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

### 1. Fetch Players
**GET /filter.html**
Fetches a list of players with optional query parameters for filtering:

- **team** (e.g., "MIL")
- **name** (e.g., "Giannis")
- **position** (e.g., "F")
- **age** (e.g., 28)
- **average** (e.g., 30 PPG)

#### Example
```bash
GET filter.html?team=mil&position=F
```

### 2. Compare Players
```bash
GET compare.html
```
Fetches detailed stats of two players for side-by-side comparison:

#### Parameters
- **playerNames** (comma-separated player names, e.g., "Giannis Antetokounmpo, LeBron James")

#### Example
```bash
GET compare.html?playerNames=Giannis%20Antetokounmpo,LeBron%20James
```

#### Response Format
```json
[
  {
    "name": "Giannis Antetokounmpo",
    "team": "MIL",
    "pos": "F",
    "ppg": 30.1,
    "apg": 5.4,
    "rpg": 11.5
  },
  {
    "name": "LeBron James",
    "team": "LAL",
    "pos": "F",
    "ppg": 28.9,
    "apg": 7.8,
    "rpg": 8.1
  }
]
```

## Features Added
### Player Comparison
- Enter the names of two players in the "Compare Players" section.
- The app fetches their stats and displays them side by side for easy comparison.

This feature helps users analyze key performance metrics like Points Per Game (PPG), Assists Per Game (APG), and Rebounds Per Game (RPG).

#### How to Use:
1. Navigate to the "Compare Players" section.
2. Enter the names of two players.
3. Click "Compare" to view their stats side by side.

