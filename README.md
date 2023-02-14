# PessimisticCoverage
L’applicazione ha la funzione di restituire l’orario corrente del sistema su cui viene eseguita.
Se l’utente che esegue il test è Americano ed inserisce l’orario aspettato nel formato 12h riscontra una failure perché il risultato è in un formato differente, concettualmente però l’orario fornito dall’applicazione è corretto.
(Se sono le 13:16 un Americano si aspetta di leggere 1:16 PM come risultato dell’applicazione)
