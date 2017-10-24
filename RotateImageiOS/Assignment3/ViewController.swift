//
//  ViewController.swift
//  Assignment3
//
//  Created by Dylan Williamson on 9/21/16.
//  Copyright © 2016 Dylan Williamson. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var Seal: UIImageView!
    @IBOutlet weak var rotate: UISwitch!

    
    @IBAction func rotate(_ sender: AnyObject) {
        
        if rotate.isOn{
            UIView.animate(withDuration: 0.5, delay: 0, options: .curveLinear, animations: { () -> Void in
                self.Seal.transform = self.Seal.transform.rotated(by: CGFloat(M_PI_2))
            }) { (finished) -> Void in
                self.rotate(sender)
            }
                   }
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        self.Seal.image = UIImage(named: "seal")
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

