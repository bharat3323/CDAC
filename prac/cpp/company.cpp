#include<iostream>
#include<vector>
#include<typeinfo>
using namespace std ;

class myException: public exception{
    const char * msg;
    public:
    myException(const char * messages):msg(messages){}
    const char * what(){
        return msg;
    }
};


class department{
    protected:
        int dept_id;
        string dept_name;

        public:
       // default const
        department(){
            this->dept_id=0;
            this->dept_name="xxxx";
        }
        //para const
        department(int dept_id,string dept_name){
            this->dept_id=dept_id;
            this->dept_name=dept_name;
        }

        virtual void display(){
           //  cout<<"display of department\n";
            cout<<"dept_id= "<<dept_id<<endl;
              cout<<"dept_name= "<<dept_name<<endl;
        }
};
class hrdepartment : public department{
        protected:
        int num_recru;
        int open_position;
        
        //default const
        public:
        hrdepartment(){
            this->num_recru=0;
            this->open_position=0;
        }
        //para const

        hrdepartment(int dept_id,string dept_name,int num_recru,int open_position)
        :department(dept_id,dept_name){
            this->num_recru=num_recru;
            this->open_position=open_position;
            if(num_recru>open_position){
                throw myException("Number of recruti are more than open Postion \n");
            }
        }

        void conductInterviews(){
            cout<<"Interviews completed for hr department"<<endl;
        }
        //display method 
        void display(){
            cout<<"--------------Hrdepartment--------"<<endl;
            department::display();
            cout<<"number of recruitor= "<<num_recru<<endl;
            cout<<"Number of opening = "<<open_position<<endl;
        }

};
class financedepartment : public department{
    private:
    double budget;

    public:
       // default const
        financedepartment(){
            this->budget=0;
        }

        //para const
        financedepartment(int dept_id,string dept_name,double budget)
        :department(dept_id,dept_name){
            this->budget=budget;
        }
        //method
        void generatefinacialreport(){
            cout<<"financedepartment report"<<endl;
        }
         void display(){
            cout<<"--------------finance department--------"<<endl;
            department::display();
            cout<<"number of recruitor= "<<endl;
            cout<<"Number of opening = "<<endl;
        }


};

//main 
int main(){
    int exit=0;
    vector<department*>dept;
    int ch;
    do{
        cout<<"============================COMPANY DEPARTMENT STRUCTURE================================\n";
        cout<<"1. Add Hrdepartment\n";
        cout<<"2. Add FinanceDepartment\n";
        cout<<"3. Special function\n";
        cout<<"4. display All department\n";
        cout<<"5. exit\n";
        cout<<"Enter your choice= ";
        cin>>ch;

       try{
        switch(ch){

            case 1:{ 
                int dept_id;
                string dept_name;
                int num_recu;
                int num_pos;
                cout<<"Enter dept_id=  "<<endl;
                cin>>dept_id;
                cout<<"enter dept_name= "<<endl;
                cin>>dept_name;
                cout<<"Enter num_recruiters= "<<endl;
                cin>>num_recu;
                cout<<"Enter the number of position= "<<endl;
                cin>>num_pos;
                dept.push_back(new hrdepartment(dept_id,dept_name,num_recu,num_pos));

                cout<<"Added into hrdepartment!!!\n";
                  break;
            
            }
          

            case 2:
            {
             int dept_id;
                string dept_name;
                double budget;
                cout<<"Enter dept_id=  "<<endl;
                cin>>dept_id;
                cout<<"enter dept_name= "<<endl;
                cin>>dept_name;
                cout<<"Enter the dept budget: "<<endl;
                cin>>budget;
                cout<<"Added into financialdepartment!!!\n";
                   dept.push_back(new financedepartment(dept_id,dept_name,budget));
          
            break;
            }


            case 3:
            for(int i=0;i<dept.size();i++){
                if(typeid(*dept[i])==typeid(hrdepartment)){
                            hrdepartment* hr=dynamic_cast<hrdepartment*>(dept[i]);
                            hr->conductInterviews();
                }else{
                    financedepartment *f=dynamic_cast<financedepartment*>(dept[i]);
                    f->generatefinacialreport();
                }
            }

            break;

            case 4:
            
            cout<<"===================Display all detail=====================";
            for(int i=0;i<dept.size();i++){
                dept[i]->display();
            }
            break;
            

            
            case 5:
             exit=1;

            break;

        }
    }catch(myException e){
        cout<<"Exception: "<<e.what();

    }


    }while (exit!=1);
    
    return 0;
}