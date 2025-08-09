import { useContext} from "react";
import { AppContext } from "../App";

const GuestPage = () => {
    const {setIsLoggedIn} = useContext(AppContext);
  return (
    <div>
      <h1>Guest Page</h1>
      <button onClick={() => setIsLoggedIn(true)}>Login to book your trip</button>
    </div>
  );
};

export default GuestPage;


// using props
// const GuestPage = (props) => {
    
//   return (
//     <div>
//       <h1>Guest Page</h1>
//       <button onClick={() => props.onLogin(true)}>Login to book your trip</button>
//     </div>
//   );
// };

// export default GuestPage;