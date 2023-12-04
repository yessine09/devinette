import React, { useState } from "react";
import axios from "axios";

const QuestionComponent = () => {
  const [questionId, setQuestionId] = useState("");
  const [responseInput, setResponseInput] = useState(""); // renamed to responseInput
  const [result, setResult] = useState(null);

  // const handleCheckResponse = async () => {
  //   try {
  //     const axiosResponse = await axios.get(
  //       `http://localhost:8087/SpringMVC/servlet/check-response?questionId=${questionId}&reponse=${responseInput}`
  //     );

  //     setResult(axiosResponse.data);
  //   } catch (error) {
  //     console.error("Error checking response:", error);
  //   }
  // };

  const handleCheckResponse = async () => {
    try {
      const axiosResponse = await axios.get(
        `http://localhost:8087/SpringMVC/servlet/api/check-response?questionId=${questionId}&reponse=${responseInput}`
      );

      console.log("Axios Response:", axiosResponse);
      setResult(axiosResponse.data);
    } catch (error) {
      console.error("Error checking response:", error);
    }
  };

  return (
    <div>
      <h2>Check Response</h2>
      <div>
        <label>Question ID:</label>
        <input
          type="text"
          value={questionId}
          onChange={(e) => setQuestionId(e.target.value)}
        />
      </div>
      <div>
        <label>Response:</label>
        <input
          type="text"
          value={responseInput} // changed from response to responseInput
          onChange={(e) => setResponseInput(e.target.value)} // changed from setResponse to setResponseInput
        />
      </div>
      <button onClick={handleCheckResponse}>Check Response</button>
      {result !== null && (
        <div>
          <p>Result: {result.toString()}</p>
        </div>
      )}
    </div>
  );
};

export default QuestionComponent;
