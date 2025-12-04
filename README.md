# priority-queue-printing-server
This project implements a priority-based print server using object-oriented programming principles in Java.
It includes:
  A custom PriorityQueue (array-based, stable ordering)
  A PrintJob class implementing the Prioritizable interface
  A PrintingServer that accepts and prints jobs by priority
  Full behavior matching the assignment specification

🚀 Features
✔️ Prioritizable Interface
  Defines objects that support prioritization:
  Priority range: 1 (low) to 10 (high)
  Methods: getPriority(), setPriority(int p)

✔️ PriorityQueue
  A fixed-size array-based priority queue that:
  Inserts elements ordered by priority
  Keeps insertion order for equal priorities (stable sort)
  Removes the highest-priority element first
  Supports up to 100 jobs

✔️ PrintJob
Represents a job sent to the printer:
  Stores print text and priority
  Invalid priorities default to 1
  Implements Prioritizable
  Provides the getText() method for printing

✔️ PrintingServer
A server that:
  Accepts new print jobs
  Stores them in the priority queue
Prints and removes the highest-priority job

Ignores print requests if the queue is empty
