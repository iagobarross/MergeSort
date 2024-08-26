package br.edu.fateczl.mergesort;

public class MergeSort {

	public MergeSort() {
		super();
	}
	
	public int [] Merge(int[] vetor, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			Merge(vetor, inicio, meio);
			Merge(vetor, meio + 1, fim);
			intercala(vetor, inicio, meio, fim);
		}
		
		return vetor;
	}

	private void intercala(int[] vetor, int inicio, int meio, int fim) {
		int [] vetorAux = new int[vetor.length];
		for(int i = inicio; i <= fim; i++) {
			vetorAux[i] = vetor[i];
		}
		
		int ponteiroEsq = inicio;
		int ponteiroDir = meio + 1;
		
		for(int cont = inicio; cont <= fim; cont++) {
			if(ponteiroEsq > meio) {
				vetor[cont] = vetorAux[ponteiroDir];
				ponteiroDir++;
			} else if (ponteiroDir > fim) {
				vetor[cont] = vetorAux[ponteiroEsq];
				ponteiroEsq++;
			} else if(vetorAux[ponteiroEsq] < vetorAux[ponteiroDir]) {
				vetor[cont] = vetorAux[ponteiroEsq];
				ponteiroEsq++;
			} else {
				vetor[cont] = vetorAux[ponteiroDir];
				ponteiroDir++;
			}
		}
		
	}

}