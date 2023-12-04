import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import QuestionComponent from "./component/QuestionComponent";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <div>
        <h1>React App</h1>
        <QuestionComponent />
      </div>
    </>
  );
}

export default App;
