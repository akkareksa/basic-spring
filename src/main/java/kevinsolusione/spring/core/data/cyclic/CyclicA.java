/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevinsolusione.spring.core.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author vckev
 */

@Data
@AllArgsConstructor
public class CyclicA {
    private CyclicB cyclicB;
}
