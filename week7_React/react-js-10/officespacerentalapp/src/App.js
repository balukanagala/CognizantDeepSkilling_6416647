import './styles.css' ;
function App() {
    let heading = <h1 className="heading">Office Space, At affordable range</h1>

    const imgUrl = "https://cdn.sanity.io/images/uqxwe2qj/production/62db3c671745e98cb27690dff96f8033d2bb7f35-2048x1010.jpg?q=80&auto=format&fit=clip&w=1440";

    let spaces = [
      {Name: "Techhub", rent: 55000, address: 'Rushikonda, Visakhapatnam'},
      {Name: "Techpark", rent: 60000, address: 'Madhurawada, Visakhapatnam'},
      {Name: "Techspace", rent: 65000, address: 'Dwaraka Nagar, Visakhapatnam'}
    ];

  return (
    <div className="App">
      {heading}
      <img src={imgUrl} alt="Office Space" width={350} height={250}/>
      <h2>Available Office Spaces</h2>
      <ul>
        {spaces.map((space) => (
          <li key={space.Name}>
            <strong>{space.Name}</strong> - <span style={{color: space.rent>60000 ? 'green' : 'red'}}>Rent: ₹{space.rent}</span>, Address: {space.address}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
