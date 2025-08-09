import React from 'react'

const CourseDetails = () => {
    const courses = [
        {Name: "Angular", startDate: "4/5/2026"},
        {Name: "React", startDate: "6/3/2026"},
    ]
  return (
    <div>
        <h1>Course Details</h1>
        <ul>{
            courses.map(course => (
                <li key={course.Name}><h3>{course.Name}</h3>
                <p>{course.startDate}</p></li>
            ))}
        </ul>
    </div>
  )
}

export default CourseDetails