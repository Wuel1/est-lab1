import abc


class EstruturaDeDados(abc.ABC):
    def __init__(self):
        self.counter = 0

    @abc.abstractmethod
    def insert(self, chave):
        indice = 0
        self[indice] = chave
        indice += 1        
        pass

    @abc.abstractmethod
    def delete(self, chave):
        for i in range(len(self)):
            if self[i] == chave:
                self[i] = -1
            else:
                print("Elemento não encontrado")
        pass

    @abc.abstractmethod
    def search(self, chave):
        for i in self:
            if i == chave:
                return True
            else:
                return False
        pass

    # @abc.abstractmethod
    # def minimum(self):
    #     pass

    # @abc.abstractmethod
    # def maximum(self):
    #     pass

    # @abc.abstractmethod
    # def sucessor(self, chave):
    #     pass

    # @abc.abstractmethod
    # def prodessor(self, chave):
    #     pass
