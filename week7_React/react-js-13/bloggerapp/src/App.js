import './App.css';
import React, { useState } from 'react';

import CourseDetails from './Components/CourseDetails';
import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';

function App() {
  const [selectedComponents, setSelectedComponents] = useState([]);

  const handleSelectionChange = (event) => {
    const options = event.target.options;
    const selected = [];
    for (let i = 0; i < options.length; i++) {
      if (options[i].selected) {
        selected.push(options[i].value);
      }
    }
    setSelectedComponents(selected);
  };

  return (
    <div className="App">
      {/* Dropdown */}
      <select multiple onChange={handleSelectionChange}>
        <option value="course">Course Details</option>
        <option value="book">Book Details</option>
        <option value="blog">Blog Details</option>
      </select>

      {/* Render selected components */}
      <div className="components-container">
        {selectedComponents.includes('course') && <CourseDetails />}
        {selectedComponents.includes('book') && <BookDetails />}
        {selectedComponents.includes('blog') && <BlogDetails />}
      </div>
    </div>
  );
}

export default App;
