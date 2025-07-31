const ListOfPlayers = () => {
    const players = [
        { name: "Rohit Sharma", score: 100 },
        { name: "Shikhar Dhawan", score: 135 },
        { name: "Virat Kohli", score: 65 },
        { name: "KL Rahul", score: 35 },
        { name: "Hardik Pandya", score: 87 },
        { name: "MS Dhoni", score: 50 },
        { name: "Ravindra Jadeja", score: 78 },
        { name: "Bhuvneshwar Kumar", score: 20 },
        { name: "Ravichandran Ashwin", score: 30 },
        { name: "Mohammad Shami", score: 7 },
        { name: "Jasprit Bumrah", score: 10 }
    ]
    const below70 = () => {
        return players.filter(player => player.score < 70);
    }

    const filteredPlayers = below70();
  return (
    <div>
        <h1>List of Players</h1>
        <ul>
            {players.map(player => (
                <li key={player.name}>{player.name}: {player.score}</li>
            ))}
        </ul>
        <hr />
        <h1>ListOfPlayers with score less than 70</h1>
        <ul>
            {filteredPlayers.map(player => (
                <li key={player.name}>{player.name}: {player.score}</li>
            ))}
        </ul>
    </div>
  )
}

export default ListOfPlayers