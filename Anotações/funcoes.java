public class funcoes{
    public static void selecao(int[]v, int tam){
        int novo, toca;
        for(int i = 0 ; i <= tam - 2; i += 1){
            novo = 1;
            for( int j = 1 ; i < tam - 1 ; i =+ 1 ){
                if( v[j] < v[novo]){
                    novo = j;
                }
            }
        if( i != novo ){
            toca = v[i];
            v[i] = v[novo];
            v[novo] = toca;
        }
       } 

    }
}