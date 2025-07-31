import React from 'react'
import '../StyleSheets/mystyle.css';

const CalculateScore = (props) => {
  const average = props.total / props.goal;         
  return (
    <div className="scorecard">
        <p className="name"><span class="label">Name:</span> {props.name}</p>
        <p className="school"><span class="label">School: </span>{props.school}</p>
        <p className="total"><span class="label">Total Marks: </span>{props.total} Marks</p>
        <p className="score"><span class="label">Score: </span>{average.toFixed(2)}%</p>
    </div>
  )
}

export default CalculateScore;