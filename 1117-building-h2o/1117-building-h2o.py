from threading import Semaphore
from threading import Barrier

class H2O:
    def __init__(self):
        self.sem_h = Semaphore(2) # used to only release H when there are 2 or 1 left. blocks if < 0
        self.sem_o = Semaphore(1) 
        self.bar_assembling = Barrier(3) # wait until HHO all done


    def hydrogen(self, releaseHydrogen: 'Callable[[], None]') -> None:
        
       with self.sem_h:
            self.bar_assembling.wait()

            releaseHydrogen()



    def oxygen(self, releaseOxygen: 'Callable[[], None]') -> None:

        with self.sem_o:
            self.bar_assembling.wait()

            releaseOxygen()