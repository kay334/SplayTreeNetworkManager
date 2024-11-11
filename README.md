# SplayTreeNetworkManager

This project implements a Splay Tree in Java to manage and simulate network nodes, where each node is represented with an IP address and an associated data packet. The Splay Tree optimizes access to frequently accessed nodes, which can be used to simulate efficient data routing in a network environment.

## Table of Contents
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Modules](#modules)
- [Example Output](#example-output)
- [License](#license)

## Project Structure

The project contains the following modules:

- `Node.java` - Represents individual nodes, each with an IP address and data packet information.
- `SplayTree.java` - Manages all tree operations, such as insertion, splaying, rotations, and searching.
- `Main.java` - The main class for initializing the Splay Tree, inserting nodes, searching, and displaying the tree contents.

## Usage

This simulation program:
1. Initializes a Splay Tree with nodes that represent IP addresses.
2. Inserts these nodes into the Splay Tree.
3. Assigns a random data packet value to each node in the tree.
4. Displays all nodes in order, showing the IP address and data packet.

When the program is run, the output is displayed in the format:

IP ADDRESS -> DATA PACKET 192.168.3.104 -> <random_value> 192.168.3.108 -> <random_value>

To customize, modify the IP addresses in `Main.java`, or add/remove nodes in the `nodes` array.

## Modules

### `Node.java`
Defines the `Node` class, representing each node in the Splay Tree with:
- `ipAdd` - IP address (integer representation).
- `dataPacket` - Stores the data packet value.
- `left`, `right`, and `parent` pointers for Splay Tree structure.

### `SplayTree.java`
The main Splay Tree class, managing tree operations such as:
- `leftRotate(Node x)` and `rightRotate(Node x)` - Tree rotations.
- `splay(Node n)` - Moves a node to the root for recent access efficiency.
- `insert(Node n)` - Inserts a new node into the tree and splays it.
- `search(Node n, int x)` - Searches for a node by IP address and splays it.
- `inorder(Node n, String cmn)` - Prints IP addresses and data packets in sorted order.

### `Main.java`
The entry point of the program:
- Initializes an array of nodes with specified IP addresses.
- Inserts each node into the Splay Tree.
- Assigns random data packets to nodes.
- Displays the contents of the tree using in-order traversal.

## Example Output

The program generates output similar to:

IP ADDRESS -> DATA PACKET 192.168.3.104 -> 56 192.168.3.108 -> 72 192.168.3.109 -> 123

Each IP address is shown with its corresponding data packet value, illustrating the Splay Tree's structure and traversal.

## License

This project is licensed under the MIT License.
