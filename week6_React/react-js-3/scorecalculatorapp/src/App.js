import './App.css';
import CalculateScore from './Components/CalculateScore';
import "./StyleSheets/mystyle.css";
function App() {
  return (
    <div className="App">
    <h1 className="Heading"><b>Student Details</b></h1>
    <CalculateScore name="Subrahmanyam" school="Raghu Engineering College" total="284" goal={3}/>
    </div>
  );
}

export default App;