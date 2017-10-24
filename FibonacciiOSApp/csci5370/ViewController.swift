//
//  ViewController.swift
//  fibonacci
//
//  Created by Dylan Williamson on 8/15/16.
//  Copyright © 2016 Dylan Williamson. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    var myString = ""
    var click = 1;
    

    @IBOutlet weak var button: UIButton!
    @IBOutlet weak var text: UITextField!
    @IBAction func click(_ sender: AnyObject) {
        let N = 40
        var fib = [Int](repeating: 1, count: N)
        
        for i in 2..<N {
            fib[i] = fib[i-1] + fib[i-2]
        }
        
        myString = String(fib[click])
        text.text = myString
        click = click + 1
        
    

    }
    @IBAction func resetButton(_ sender: AnyObject) {
        click = 1
        text.text = "1"
    }
    
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    
   
}

