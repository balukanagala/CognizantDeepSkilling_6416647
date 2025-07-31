import React from 'react';
import Post from '../Post'; // Assuming Post is a class that takes id, title, and body as parameters
export class Posts extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }

    loadPosts(){
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                const postsArray = data.map(post => new Post(post.id, post.title, post.body));
                this.setState({ posts: postsArray });
            })
            .catch(error => {
                console.error('Error fetching posts:', error);
                this.setState({ hasError: true });
            });
    }

    componentDidMount(){ // this function is called after the component is mounted
       this.loadPosts();
    }

    render(){
        if (this.state.hasError) {
            return <h2>Something went wrong.</h2>;
        }
        
        return(
        <div>
            <h1>Posts</h1>
            {this.state.posts.map(post => (
                <div key={post.id}>
                    <h2>{post.title}</h2>
                    <p>{post.body}</p>
                </div>
            ))}
        </div>
        );
    }

    componentDidCatch(error, info){
        this.setState({ hasError: true });
       alert("An error occurred : " + error.toString());
    }
}