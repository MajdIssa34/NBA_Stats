// Redirect to compare.html when the "Compare Players" button is clicked
document.getElementById('comparePlayers').addEventListener('click', function() {
    window.location.href = 'compare.html'; // Redirect to compare.html
});

document.getElementById('applyFilters').addEventListener('click', function(event) {
    event.preventDefault(); // Prevent page reload

    const team = document.getElementById('team').value;
    const name = document.getElementById('name').value;
    const position = document.getElementById('position').value;
    const age = document.getElementById('age').value;
    const average = document.getElementById('average').value;
    const threept = document.getElementById('threept').value;

    // Prepare query parameters, ignoring empty values
    let query = '?';
    if (team) query += `team=${team}&`;
    if (name) query += `name=${name}&`;
    if (position) query += `position=${position}&`;
    if (age) query += `age=${age}&`;
    if (average) query += `average=${average}&`;
    if(threept) query += `threept=${threept}&`;

    // Remove trailing '&' if any
    query = query.slice(0, -1);

    // Make the fetch request
    fetch(`http://localhost:8090/api/v1/player${query}`)
        .then(response => response.json())
        .then(data => {
            renderPlayers(data);
        })
        .catch(error => {
            console.error('Error fetching players:', error);
        });
});

function renderPlayers(players) {
    const playersList = document.querySelector('.players-list');
    playersList.innerHTML = ''; // Clear existing players

    players.forEach(player => {
        const playerCard = document.createElement('div');
        playerCard.classList.add('player-card');
        playerCard.innerHTML = `
            <h3>${player.name}</h3>
            <p>Team: ${player.team}</p>
            <p>Position: ${player.pos}</p>
            <p>Age: ${player.age}</p>
            <p>PPG: ${player.ppg}</p>
            <p>3pt%: ${player.threept}</p>
        `;
        playersList.appendChild(playerCard);
    });
}
