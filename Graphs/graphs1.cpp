#include<iostream>
#include<list>
#include<unordered_map>
#include<cstring>
using namespace std;

class Graph{
    private:
        int v;
        list<int> *vertex;

    public:
        Graph(int v){
            this->v = v;
            vertex = new list<int>[v];
        }
        void addEdge(int initial,int final){
            vertex[initial].push_back(final);
            vertex[final].push_back(initial);
        }
        void printAdjacencyList(){
            for (int i = 0; i < v; i++)
            {
                cout << i << "->";
                for(int v:vertex[i]){
                    cout << v << " ";
                }
                cout << endl;
            }
            
        }
};


class Graph1
{
    private:
        int v;
        unordered_map<string, list<pair<string, int>>> l;
    public:
        void addEdge(string initial,string final,bool bidir,int weight){
            l[initial].push_back(make_pair(final, weight));
            l[final].push_back(make_pair(initial, weight));
            
        }

};

int main(){
    Graph *g = new Graph(4);
    g->addEdge(0, 1);
    g->addEdge(0, 2);
    g->addEdge(1, 2);
    g->addEdge(2, 3);
    g->printAdjacencyList();
}