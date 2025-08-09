import React from 'react'

const BlogDetails = () => {
    const blogs = [
        {title: 'React Learning', author: 'Stephen Biz', text: 'Welcome to learning React'},
        {title: 'Installation', author: 'Scheewzdenier', text:'You can install React from npm'}
    ]
  return (
    <div>
       <h1>Blog Details</h1>
    <ul>
        {
            blogs.map(blog => (
                <li key={blog.title}><h3>{blog.title}</h3>
                <p>{blog.author}</p> 
                <p>{blog.text}</p></li>
            ))
        }
    </ul>
        </div>
  )
}

export default BlogDetails