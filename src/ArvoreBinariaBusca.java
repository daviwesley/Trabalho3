public class ArvoreBinariaBusca {
	public No root;

	public ArvoreBinariaBusca() {
		this.root = null;
	}

	public boolean find(int id) {
		No current = root;
		while (current != null) {
			if (current.data == id) {
				return true;
			} else if (current.data > id) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return false;
	}

	public boolean delete(int id) {
		No parent = root;
		No current = root;
		boolean isLeftChild = false;
		while (current.data != id) {
			parent = current;
			if (current.data > id) {
				isLeftChild = true;
				current = current.left;
			} else {
				isLeftChild = false;
				current = current.right;
			}
			if (current == null) {
				return false;
			}
		}
		// No encontrado
		//Caso 1: Se o n� tem nenhum elemento
		if (current.left == null && current.right == null) {
			if (current == root) {
				root = null;
			}
			if (isLeftChild == true) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}
		//Caso 2: Se o n� tem  somente um filho
		else if (current.right == null) {
			if (current == root) {
				root = current.left;
			} else if (isLeftChild) {
				parent.left = current.left;
			} else {
				parent.right = current.left;
			}
		} else if (current.left == null) {
			if (current == root) {
				root = current.right;
			} else if (isLeftChild) {
				parent.left = current.right;
			} else {
				parent.right = current.right;
			}
		} else if (current.left != null && current.right != null) {
			//encontra o minimo valor valor da sub-arvore da direita
			No successor = getSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.left = successor;
			} else {
				parent.right = successor;
			}
			successor.left = current.left;
		}
		return true;
	}

	public No getSuccessor(No deleleNo) {
		No successsor = null;
		No successsorParent = null;
		No current = deleleNo.right;
		while (current != null) {
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		//verifica se o sucessor tem um no direito, se tiver um no direito adiciona 
		//no no esquerdo do pai
		if (successsor != deleleNo.right) {
			successsorParent.left = successsor.right;
			successsor.right = deleleNo.right;
		}
		return successsor;
	}

	public void insert(int id) {
		No newNo = new No(id);
		if (root == null) {
			root = newNo;
			return;
		}
		No current = root;
		No parent = null;
		while (true) {
			parent = current;
			if (id < current.data) {
				current = current.left;
				if (current == null) {
					parent.left = newNo;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNo;
					return;
				}
			}
		}
	}

	private void preOrdem(No node) {
		if (node != null) {
			System.out.print(node.data + ", ");
			preOrdem(node.left);
			preOrdem(node.right);

		}
	}

	private void posOrdem(No node) {
		if (node != null) {

			posOrdem(node.left);
			posOrdem(node.right);
			System.out.print(node.data + ", ");

		}

	}

	private void inOrdem(No node) {
		if (node != null) {
			inOrdem(node.left);
			System.out.print(node.data + ", ");
			inOrdem(node.right);

		}
	}

	public void ImprimePosOrdem() {
		posOrdem(root);
	}

	public void ImprimePreOrdem() {
		preOrdem(root);
	}

	public void ImprimeOrdem() {
		inOrdem(root);
	}

	public void display() {
		display(root);
	}

	private void display(No root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}

}
