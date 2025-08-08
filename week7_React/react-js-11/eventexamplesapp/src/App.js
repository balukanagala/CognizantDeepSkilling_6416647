import React,{useState} from 'react';
import './App.css';
import CurrencyConvertor from './Components/CurrencyConvertor';
function App() {

  const [ctr,setCtr] = useState(0);
  const [flag,setFlag] = useState(false);
  const [text,setText] = useState("Hello");

  function increase(){
    setCtr(ctr+1);
  }

  function display(){
    setText(text+" World");
  }
  function decrement(){
    setCtr(ctr-1);
  }

  function incDisplay(){
    setFlag(true);
    increase();
    display();
  }

  function greeting(greet){
    alert(greet);
  }

  return (
    <div className="App">
      <h1>Counter : {ctr}</h1>
      <h1>{flag && text}</h1>
      <br />
      <button onClick={incDisplay}>Increment</button>
      <br />
      <button onClick={decrement}>Decrement</button>
      <br />
      <button onClick={() => greeting("welcome")}>Welcome</button>
      <br />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
