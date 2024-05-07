# Interfacce
L'interfaccia è un elemento di Java che:
- permette di creare un insieme di metodi senza specificarne la logica;
- non possiede costruttore;
- può contenere variabili, definite con final e inizializzate

Parole chiave: 
- **interface**
- **implements**

### Utilizzo delle interfacce
Una classe che implementa un'interfaccia (utilizzando la parola chiave **implements**) deve obbligatoriamente implementarne i metodi (tutti).

Una classe può implementare più interfacce.

Un'interfaccia può implementare una o più interfacce (Ereditarietà multipla)

Ricorda: una classe può estendere solo una classe, contrariamente alle interfacce.

### Quando si utilizza un'interfaccia
Le interfacce vengono utilizzate principalmente nel caso in cui ci siano gli stessi metodi utilizzati da più classi.
Es: all'interno di un model l'interfaccia può definire quei metodi che permettono l'accesso ai dati, l'aggiornamento, la manipolazione.