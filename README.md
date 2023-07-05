# reactive programming paradigm for backend dev

Reactive programming is react to something, when user clicks this button, run this function.

## why do we care ?

Server side web development

- Request comes in
- We do processing
- We return response

### A case for Reactive Programming

Modern application development

- High data scale
- High usage scale
- Cloud based costs

How do we scale?

- Vertical scaling
- Horizontal scaling

We code like...

- It's a single request
- Multiple simultaneous users abstracted out
- Delays abstracted out
- We pay with sequential blocking operations
- We pay with idling threads

To overcome this we can go with Concurrent api. But Concurrent api itself has a lot of probelm.

- Too much for the dev to do.
- Error handling is messy.
- It's still sync after all.
- We need a new paradigm.
- The framework needs to support it.

This is where reactive programming came into picture.

What's different

- Much simpler than the manual concurrent way
- Few reusable flexible functions
- Combine and reuse in powerful ways

Reactive programming

- Different way of thinking about flow
- Different way of thinking about data
- Integrated with Java! s Flows interface
