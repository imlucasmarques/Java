
public class AVLTree<T extends Comparable<T>> {
	private No<T> raiz;

	public void inserir(T dado) {
		this.raiz = inserir(this.raiz, dado);
	}

	private No<T> inserir(No<T> no, T dado) {
		if (no == null) {
			return new No<T>(dado);
		}

		if (dado.compareTo(no.getDado()) < 0) {
			no.setEsq(inserir(no.getEsq(), dado));
		} else if (dado.compareTo(no.getDado()) > 0) {
			no.setDir(inserir(no.getDir(), dado));
		} else {
			// n� j� existe na �rvore AVL
			return no;
		}

		// atualiza a altura do n� correnete
		no.setAltura(1 + Math.max(getAltura(no.getEsq()), getAltura(no.getDir())));

		// verifica se a �rvore est� desbalanceada para realizar as rota��es
		int fatorBalanceamento = getFatorBalanceamento(no);

		if (fatorBalanceamento > 1 && dado.compareTo(no.getEsq().getDado()) < 0) {
			return rotacaoDireita(no);
		}

		if (fatorBalanceamento < -1 && dado.compareTo(no.getDir().getDado()) > 0) {
			return rotacaoEsquerda(no);
		}

		if (fatorBalanceamento > 1 && dado.compareTo(no.getEsq().getDado()) > 0) {
			no.setEsq(rotacaoEsquerda(no.getEsq()));
			return rotacaoDireita(no);
		}

		if (fatorBalanceamento < -1 && dado.compareTo(no.getDir().getDado()) < 0) {
			no.setDir(rotacaoDireita(no.getDir()));
			return rotacaoEsquerda(no);
		}

		return no;
	}

	// m�todo para realizar a rota��o a direita
	private No<T> rotacaoDireita(No<T> no) {
		No<T> novaRaiz = no.getEsq();
		No<T> subtreeDireita = novaRaiz.getDir();

		novaRaiz.setDir(no);
		no.setEsq(subtreeDireita);

		no.setAltura(1 + Math.max(getAltura(no.getEsq()), getAltura(no.getDir())));
		novaRaiz.setAltura(1 + Math.max(getAltura(novaRaiz.getEsq()), getAltura(novaRaiz.getDir())));

		return novaRaiz;
	}

	// m�todo para realizar a rota��o a esquerda
	private No<T> rotacaoEsquerda(No<T> no) {
		No<T> novaRaiz = no.getDir();
		No<T> subtreeEsquerda = novaRaiz.getEsq();

		novaRaiz.setEsq(no);
		no.setDir(subtreeEsquerda);

		no.setAltura(1 + Math.max(getAltura(no.getEsq()), getAltura(no.getDir())));
		novaRaiz.setAltura(1 + Math.max(getAltura(novaRaiz.getEsq()), getAltura(novaRaiz.getDir())));

		return novaRaiz;
	}

	// m�todo para retornar a altura de um n�
	private int getAltura(No<T> no) {
		if (no == null) {
			return 0;
		}
		return no.getAltura();
	}

	// m�todo para calcular o fator de balanceamento de um n�
	private int getFatorBalanceamento(No<T> no) {
		if (no == null) {
			return 0;
		}
		return getAltura(no.getEsq()) - getAltura(no.getDir());
	}

	// m�todo para fazer o percurso pr�-ordem
	public String preOrdem() {
		return preOrdem(raiz);
	}

	private String preOrdem(No<T> raiz) {
		String aux = "";
		if (raiz == null) {
			return "";
		}

		aux += raiz.getDado() + "\n";
		aux += preOrdem(raiz.getEsq());
		aux += preOrdem(raiz.getDir());
		return aux;
	}
	
	// m�todo para realizar a remo��o de um n� em uma �rvore AVL
	public void remover(T dado) {
	    raiz = remover(raiz, dado);
	}

	private No<T> remover(No<T> no, T dado) {
	    if (no == null) {
	        return no;
	    }

	    if (dado.compareTo(no.getDado()) < 0) {
	        no.setEsq(remover(no.getEsq(), dado));
	    } else if (dado.compareTo(no.getDado()) > 0) {
	        no.setDir(remover(no.getDir(), dado));
	    } else {
	        // n� encontrado para remo��o
	        // caso 1: o n� n�o tem filhos ou tem apenas um
	        if (no.getEsq() == null || no.getDir() == null) {
	            No<T> noFilho = (no.getEsq() == null) ? no.getDir() : no.getEsq();

	            // n� n�o tem filhos
	            if (noFilho == null) {
	                no = null;
	            } else {
	                no = noFilho;
	            }

	        // caso 2: o n� tem dois filhos
	        } else {
	            // busca pelo sucessor (menor valor na subarvore direita)
	            No<T> successor = no.getDir();
	            while (successor.getEsq() != null) {
	                successor = successor.getEsq();
	            }
	            
	            // copia o valor do sucessor para o n� corrente
	            no.setDado(successor.getDado());

	            // remove o sucessor da subarvore direita
	            no.setDir(remover(no.getDir(), successor.getDado()));
	        }
	    }

	    // retorna null se o n� n�o foi encontrado
	    if (no == null) {
	        return null;
	    }

	    // atualiza a altura do n� corrente
	    no.setAltura(1 + Math.max(getAltura(no.getEsq()), getAltura(no.getDir())));

	    // a �rvore est� desbalanceada? Se estiver, aplica as rota��es
	    int fatorBalanceamento = getFatorBalanceamento(no);

	    if (fatorBalanceamento > 1 && getFatorBalanceamento(no.getEsq()) >= 0) {
	        return rotacaoDireita(no);
	    }

	    if (fatorBalanceamento > 1 && getFatorBalanceamento(no.getEsq()) < 0) {
	        no.setEsq(rotacaoEsquerda(no.getEsq()));
	        return rotacaoDireita(no);
	    }

	    if (fatorBalanceamento < -1 && getFatorBalanceamento(no.getDir()) <= 0) {
	        return rotacaoEsquerda(no);
	    }

	    if (fatorBalanceamento < -1 && getFatorBalanceamento(no.getDir()) > 0) {
	        no.setDir(rotacaoDireita(no.getDir()));
	        return rotacaoEsquerda(no);
	    }

	    return no;
	}


}
