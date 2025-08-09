import React,{createContext} from 'react';
import UserPage from './Components/UserPage';
import GuestPage from './Components/GuestPage';
import './App.css';

export const AppContext = createContext();

function App() {
  const [isLoggedIn, setIsLoggedIn] = React.useState(false);

  return (
    <AppContext.Provider value={{setIsLoggedIn }}>
    <div className="App">
      {isLoggedIn ? <UserPage/> : <GuestPage/>}
    </div>
    </AppContext.Provider>
  );
}

export default App;


// using props to pass state and functions
// export default function App() {
//   const [isLoggedIn, setIsLoggedIn] = React.useState(false);

//   return (
//     <div className="App">
//       {isLoggedIn 
//         ? <UserPage onLogout={setIsLoggedIn} /> 
//         : <GuestPage onLogin={setIsLoggedIn} />}
//     </div>
//   );
// }
