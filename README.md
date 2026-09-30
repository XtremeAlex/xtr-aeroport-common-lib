<a name="readme-top"></a>

<div align="center">
  <img src="_assets/images/banner-dark.png" alt="Aeroport Common Lib" width="100%">
  <br /><br />
  <img src="_assets/images/logo.png" width="300" alt="Logo">
</div>

# xtr-aeroport-common-lib

La libreria condivisa della suite `xtr-aeroport-*`. Qui ci sono i modelli, le utility e i componenti comuni che i microservizi riusano.

> Stato: legacy. Oggi la importano solo `xtr-aeroport-ms` e `xtr-aeroport-typology`, entrambi deprecati. L'API attuale (`xtr-aeroport-api-spring`) e il batch non la usano. La libreria resta qui e compila, ma non è più al centro dello sviluppo. Tempo fa avevo pensato di dividerla in `common-model` (solo DTO) e `common-persistence` (entity e repository JPA), così da non trascinarsi dietro web e JPA ovunque. Quel lavoro non è mai partito.

<details>
  <summary>Sommario</summary>
  <ol>
    <li><a href="#perché-esiste">Perché esiste</a></li>
    <li><a href="#la-suite">La suite</a></li>
    <li><a href="#stack-tecnologico">Stack tecnologico</a></li>
    <li><a href="#per-iniziare">Per iniziare</a></li>
    <li><a href="#come-contribuire">Come contribuire</a></li>
    <li><a href="#licenza">Licenza</a></li>
    <li><a href="#contatti">Contatti</a></li>
    <li><a href="#ringraziamenti">Ringraziamenti</a></li>
  </ol>
</details>

## Perché esiste

È un progetto personale nato per provare tecnologie e framework recenti su un caso concreto. Doveva essere la base comune dei moduli della suite, con un'impostazione da progetto aziendale e le buone pratiche al loro posto, così da poter ripartire da qui per sviluppi futuri.

È uno dei moduli di una serie più ampia, che ho pubblicato perché chiunque possa usarla e migliorarla.

## La suite

| Modulo | A cosa serve | Stato |
|---|---|---|
| `xtr-aeroport-api-spring` | API unica per aeroporti, tipologie, paesi e messaggi EDIFACT (non ancora pubblicata su GitHub) | Attivo |
| `xtr-aeroport-api-quarkus` | Porting della stessa API su Quarkus (non ancora pubblicato su GitHub) | Sperimentale |
| `xtr-aeroport-edifact-spring-web` | Console web EDIFACT, ha preso il posto di `xtr-aeroport-web-java` (non ancora pubblicata su GitHub) | Attivo |
| [`xtr-aeroport-batch`](https://github.com/XtremeAlex/xtr-aeroport-batch) | Import massivo dei dati | Attivo, offline |
| [`xtr-aeroport-common-lib`](https://github.com/XtremeAlex/xtr-aeroport-common-lib) | Libreria condivisa (questo modulo) | Legacy |
| [`xtr-aeroport-ms`](https://github.com/XtremeAlex/xtr-aeroport-ms) | Microservizio di ricerca aeroporti | Deprecato |
| [`xtr-aeroport-typology`](https://github.com/XtremeAlex/xtr-aeroport-typology) | Servizio dati tipologici | Deprecato |
| [`xtr-aeroport-web-java`](https://github.com/XtremeAlex/xtr-aeroport-web-java) | Frontend web | Deprecato |

## Stack tecnologico

- Java 17
- Spring Boot 3.2.1
- MapStruct, Lombok
- Maven
- Gira su Linux, macOS e Windows

## Per iniziare
Si compila con Maven, su Spring Boot 3 e Java 17.

### Cosa serve

- Git (>= 2.43)
- Java OJDK (GraalVM versione 17)
- Maven (Apache Maven >= 3.9.6)

### Coordinate del progetto

| Proprietà | Valore |
|---|---|
| artifactId | `aeroport-common-lib` |
| version | `1.0.0` |

### Clonare e compilare

1. Clona il repository:
   ```bash
   git clone https://github.com/XtremeAlex/xtr-aeroport-common-lib.git
   cd xtr-aeroport-common-lib
   ```

2. Compila e installa la libreria nel repository Maven locale, così gli altri moduli la trovano:
   ```bash
   mvn clean install
   ```
   <img src="_assets/images/mvn-build.png" alt="Build Maven"/>

## Come contribuire

Ogni contributo è ben accetto, anche piccolo. Il giro è quello classico:

1. fai un fork del progetto;
2. crea un branch per la tua modifica (`git checkout -b feature/nome-feature`);
3. fai commit (`git commit -m "Aggiunge nome-feature"`);
4. fai push del branch (`git push origin feature/nome-feature`);
5. apri una Pull Request.

Se hai solo un'idea, apri una issue con l'etichetta giusta. E se il progetto ti è utile, una stella fa sempre piacere.

## Licenza
Doppia licenza: **GNU AGPL-3.0** (vedi [`LICENSE`](LICENSE)) per l'uso open source, e **licenza commerciale** per l'uso dentro prodotti proprietari (vedi [`COMMERCIAL-LICENSE.md`](COMMERCIAL-LICENSE.md)).

## Contatti

Andrei Alexandru Dabija (XtremeAlex) · [alexdabi92@gmail.com](mailto:alexdabi92@gmail.com) · [2ad.bubume.it](https://2ad.bubume.it/) · [LinkedIn](https://www.linkedin.com/in/andrei-alexandru-dabija/) · [github.com/XtremeAlex](https://github.com/XtremeAlex)

## Ringraziamenti

- [Spring Boot](https://spring.io/projects/spring-boot)
- [MapStruct](https://mapstruct.org/) e [Lombok](https://projectlombok.org/)
- [Best-README-Template](https://github.com/othneildrew/Best-README-Template), da cui ho preso spunto per la struttura

<p align="right">(<a href="#readme-top">torna su</a>)</p>
