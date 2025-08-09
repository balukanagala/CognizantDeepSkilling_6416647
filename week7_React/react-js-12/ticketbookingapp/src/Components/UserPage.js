import { useContext} from "react";
import { AppContext } from "../App";

const UserPage =() => {
    const {setIsLoggedIn} = useContext(AppContext);
  return (
    <div>
      <h1>User Page</h1>
      <button onClick={() => setIsLoggedIn(false)}>Logout</button>
    </div>
  );
};

export default UserPage;


// Using props
// const UserPage = (props) => {
//   return (
//     <div>
//       <h1>User Page</h1>
//       <button onClick={() => props.onLogout(false)}>Logout</button>
//     </div>
//   );
// };

// export default UserPage;