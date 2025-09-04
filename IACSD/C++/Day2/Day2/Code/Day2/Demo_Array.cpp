#include<iostream>
using namespace std;


int main(){

    int choice;
    cout<<"1:add element in array 2:show arr 3:search element 4:sum of elements 6:Search Using Bool 5:2D array"<<endl;
    
    bool flag=false;
    int index=0;
    int arr[10];
    int num,i,total=0;

    do{
        cout<<"\t Enter Choice:";
        cin>>choice;

        switch (choice)
        {
        case 1: 
                if(index<=9){
                cout<<"\t Enter value:";
                cin>>num;
                arr[index]=num;
                index++;
                }
                else{
                    cout<<"\t Array Is Full "<<endl;
                }
            break;
        case 2:  if(index==0)
                 cout<<"Array Is Empty "<<endl;
                 else
                 {
                  for(i=0;i<index;i++)
                  {
                    cout<<"\t \t"<<arr[i]<<endl;
                  } 
                  }    
            break;
        case 3: if(index==0)
              {
                cout<<"Array Is Empty "<<endl;
              }else
              {
              cout<<"\t \t Enter Number To Search:";
              cin>>num;
              for(i=0;i<index;i++){
                if(arr[i]==num)
                {
                 cout<<"\t \t Number is Present:"<<endl;
                }
                else
                {
                   cout<<"\t \t Number is  Not Present:"<<endl;
                 
                }
              }
              } 
            break;
        case 6: if(index==0)
              {
                cout<<"Array Is Empty "<<endl;
              }else
              {
              cout<<"\t \t Enter Number To Search:";
              cin>>num;
              for(i=0;i<index;i++){
                if(arr[i]==num)
                {
                    flag=true;

                 //cout<<"\t \t Number is Present:"<<endl;
                 break;
                }
                else
                {
                    flag=false;

                  // cout<<"\t \t Number is  Not Present:"<<endl;
                 
                }
              }
              if(flag==true){
                cout<<"\t\t Number Is Present "<<endl;
              }
              else
              {
                cout<<"\t\t Number Is Not Present "<<endl;
              }
              }          
            break;
        case 4:total=0;
            for(i=0;i<index;i++)
              {
          // total=total+arr[i];
           //or
           total+=arr[i];
              }
              cout<<"\t\t sum of array="<<total<<endl;
        break;
        case 5: cout<<"\t\t 2D Array Demo "<<endl;
               int marr[3][3];
               int row,col;

               for(row=0;row<3;row++){
                  cout<<"Row :"<<row<<endl;
                  
                  for(col=0;col<3;col++){
                    cout<<"\n marr["<<row<<","<<col<<"]=";
                    cin>>marr[row][col];//0,0 0,1 0,2  1,0
                  }
               }
               cout<<"\t\t-------------------------"<<endl;
               for(row=0;row<3;row++){
                for(col=0;col<3;col++){
                    cout<<marr[row][col]<<"  ";
                }
                cout<<"\n";
               }

               break;
        default:cout<<"\t Invalid choice "<<endl;
            break;
        }


    }while(choice!=0);












    return 0;
}