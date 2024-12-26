document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('comparePlayers').addEventListener('click', (e) => {
        e.preventDefault(); // Prevent form submission

        const player1 = document.getElementById('player1').value.trim();
        const player2 = document.getElementById('player2').value.trim();

        if (!player1 || !player2) {
            alert('Please enter names for both players.');
            return;
        }

        // Fetch comparison data from the backend
        fetch(`http://localhost:8090/api/v1/player/compare?playerNames=${player1},${player2}`)
            .then((response) => {
                if (!response.ok) {
                    throw new Error('Failed to fetch comparison data.');
                }
                return response.json();
            })
            .then((players) => {
                const resultDiv = document.getElementById('comparisonResult');
                if (players.length < 2) {
                    resultDiv.innerHTML = `<p>One or both players not found. Try different names.</p>`;
                    return;
                }

                // Use the render function to display the comparison results
                renderPlayers(players);
            })
            .catch((error) => {
                console.error('Error:', error);
                alert('Unable to fetch player comparison. Please try again later.');
            });
    });
});

// Render players function (same logic as filtering)
function renderPlayers(players) {
    const playersList = document.querySelector('#comparisonResult');
    playersList.innerHTML = ''; // Clear existing comparison results

    players.forEach(player => {
        const playerCard = document.createElement('div');
        playerCard.classList.add('player-card');
        playerCard.innerHTML = `
            <h3>${player.name}</h3>
            <p><strong>Team:</strong> ${player.team}</p>
            <p><strong>Position:</strong> ${player.pos}</p>
            <p><strong>PPG:</strong> ${player.ppg}</p>
            <p><strong>APG:</strong> ${player.apg}</p>
            <p><strong>RPG:</strong> ${player.rpg}</p>
        `;
        playersList.appendChild(playerCard);
    });
}
