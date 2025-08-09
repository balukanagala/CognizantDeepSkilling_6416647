import React from 'react'

const BookDetails = () => {
    const books = [
        {title: 'Master React', price:670},
        {title: 'Deep Dive into Angular 11', price:800},
        {title: 'Mongo Essentials', price:450}
    ]
  return (
    <div>
       <h1>Book Details</h1>
    <ul>
        {
            books.map(book => (
                <li key={book.title}><h3>{book.title}</h3>
                <p>{book.price}</p></li>
            ))
        }
    </ul>
        </div>
  )
}

export default BookDetails