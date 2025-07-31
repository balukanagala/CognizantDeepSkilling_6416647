const IndianPlayers = () => {
    const t20players = ['Abhishek Sharma', 'Ruturaj Gaikwad', 'Tilak Varma'];
    const RanjiTrophyPlayers = ['Ajinkya Rahane', 'Shreyas Iyer', 'Prithvi Shaw'];

    // merging using spread operators
    const allPlayers = [...t20players, ...RanjiTrophyPlayers];

    // destructuring into odd and even players
    const oddPlayers = allPlayers.filter((_, index) => index % 2 !== 0);
    const evenPlayers = allPlayers.filter((_, index) => index % 2 === 0);
    
  return (
    <div>
        <h1>Even Players</h1>
        <ul>
            {evenPlayers.map(player => (
                <li key={player}>{player}</li>
            ))}
        </ul>
        <hr />
        <h1>Odd Players</h1>
        <ul>
            {oddPlayers.map(player => (
                <li key={player}>{player}</li>
            ))}
        </ul>
        <hr />
        <h1>List of Indain Players Merged</h1>
        <ul>
            {allPlayers.map(player => (
                <li key={player}>{player}</li>
            ))}
        </ul>
    </div>
    
  )
}

export default IndianPlayers